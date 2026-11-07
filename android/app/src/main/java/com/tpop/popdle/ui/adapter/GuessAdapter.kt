package com.tpop.popdle.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.tpop.popdle.R
import com.tpop.popdle.data.model.MatchStatus
import com.tpop.popdle.data.model.MemberGuessComparison
import com.tpop.popdle.data.model.NumericDirection
import com.tpop.popdle.databinding.ItemGuessRowBinding

class GuessAdapter(
    private val guesses: MutableList<MemberGuessComparison> = mutableListOf()
) : RecyclerView.Adapter<GuessAdapter.GuessViewHolder>() {

    fun addGuess(comparison: MemberGuessComparison) {
        guesses.add(0, comparison) // En yeni tahmin en üstte görünsün
        notifyItemInserted(0)
    }

    fun clearGuesses() {
        guesses.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuessViewHolder {
        val binding = ItemGuessRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GuessViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GuessViewHolder, position: Int) {
        holder.bind(guesses[position])
    }

    override fun getItemCount(): Int = guesses.size

    inner class GuessViewHolder(private val binding: ItemGuessRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(comparison: MemberGuessComparison) {
            val member = comparison.guessedMember
            val context = binding.root.context

            // 1. Üye Bilgisi
            binding.tvMemberName.text = member.name
            binding.tvMemberAvatar.text = member.name.firstOrNull()?.toString() ?: "T"

            // 2. Grup
            binding.tvGroupName.text = member.group
            binding.boxGroup.setBackgroundResource(getBackgroundForStatus(comparison.groupMatch))

            // 3. Cinsiyet
            binding.tvGender.text = member.gender
            binding.boxGender.setBackgroundResource(getBackgroundForStatus(comparison.genderMatch))

            // 4. Rol
            binding.tvRole.text = member.roleDisplay
            binding.boxRole.setBackgroundResource(getBackgroundForStatus(comparison.roleMatch))

            // 5. Yaş & Yön Oku
            binding.tvAge.text = comparison.ageComparison.value.toString()
            binding.boxAge.setBackgroundResource(getBackgroundForStatus(comparison.ageComparison.status))
            when (comparison.ageComparison.direction) {
                NumericDirection.HIGHER -> {
                    binding.ivAgeArrow.visibility = View.VISIBLE
                    binding.ivAgeArrow.setImageResource(R.drawable.ic_arrow_up)
                }
                NumericDirection.LOWER -> {
                    binding.ivAgeArrow.visibility = View.VISIBLE
                    binding.ivAgeArrow.setImageResource(R.drawable.ic_arrow_down)
                }
                NumericDirection.EQUAL -> {
                    binding.ivAgeArrow.visibility = View.GONE
                }
            }

            // 6. Çıkış Yılı & Yön Oku
            binding.tvDebut.text = comparison.debutComparison.value.toString()
            binding.boxDebut.setBackgroundResource(getBackgroundForStatus(comparison.debutComparison.status))
            when (comparison.debutComparison.direction) {
                NumericDirection.HIGHER -> {
                    binding.ivDebutArrow.visibility = View.VISIBLE
                    binding.ivDebutArrow.setImageResource(R.drawable.ic_arrow_up)
                }
                NumericDirection.LOWER -> {
                    binding.ivDebutArrow.visibility = View.VISIBLE
                    binding.ivDebutArrow.setImageResource(R.drawable.ic_arrow_down)
                }
                NumericDirection.EQUAL -> {
                    binding.ivDebutArrow.visibility = View.GONE
                }
            }

            // 7. Burç
            binding.tvZodiac.text = member.zodiac
            binding.boxZodiac.setBackgroundResource(getBackgroundForStatus(comparison.zodiacMatch))
        }

        private fun getBackgroundForStatus(status: MatchStatus): Int {
            return when (status) {
                MatchStatus.MATCH -> R.drawable.bg_card_correct
                MatchStatus.PARTIAL -> R.drawable.bg_card_partial
                MatchStatus.MISMATCH -> R.drawable.bg_card_wrong
            }
        }
    }
}
