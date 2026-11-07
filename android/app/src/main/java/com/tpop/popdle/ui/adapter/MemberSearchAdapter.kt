package com.tpop.popdle.ui.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.TextView
import com.tpop.popdle.R
import com.tpop.popdle.data.model.TPopMember

class MemberSearchAdapter(
    context: Context,
    private val allMembers: List<TPopMember>
) : ArrayAdapter<TPopMember>(context, 0, allMembers) {

    private var filteredList: List<TPopMember> = allMembers

    override fun getCount(): Int = filteredList.size

    override fun getItem(position: Int): TPopMember? =
        if (position in filteredList.indices) filteredList[position] else null

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(
            R.layout.item_search_dropdown,
            parent,
            false
        )

        val member = getItem(position) ?: return view

        val tvAvatar = view.findViewById<TextView>(R.id.tvDropdownAvatar)
        val tvName = view.findViewById<TextView>(R.id.tvDropdownName)
        val tvSub = view.findViewById<TextView>(R.id.tvDropdownSub)
        val tvBadge = view.findViewById<TextView>(R.id.tvDropdownGroupBadge)

        tvAvatar.text = member.groupIconEmoji
        try {
            val bg = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(Color.parseColor(member.avatarBgColor))
            }
            tvAvatar.background = bg
        } catch (e: Exception) {
            tvAvatar.setBackgroundResource(R.drawable.bg_gradient_button)
        }

        tvName.text = member.name
        tvSub.text = "${member.groupIconEmoji} ${member.group} • ${member.roleDisplay}"
        tvBadge.text = "${member.groupIconEmoji} ${member.group}"

        return view
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val results = FilterResults()
                if (constraint.isNullOrBlank()) {
                    results.values = allMembers
                    results.count = allMembers.size
                } else {
                    val query = constraint.toString().trim().lowercase()
                    val filtered = allMembers.filter {
                        it.name.lowercase().contains(query) ||
                        it.group.lowercase().contains(query)
                    }
                    results.values = filtered
                    results.count = filtered.size
                }
                return results
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filteredList = (results?.values as? List<TPopMember>) ?: allMembers
                notifyDataSetChanged()
            }

            override fun convertResultToString(resultValue: Any?): CharSequence {
                return (resultValue as? TPopMember)?.name ?: ""
            }
        }
    }
}
