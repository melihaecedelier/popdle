package com.tpop.popdle.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.tpop.popdle.R
import com.tpop.popdle.data.model.TPopMember

class WinDialog(
    context: Context,
    private val member: TPopMember,
    private val attemptCount: Int,
    private val pointsEarned: Int,
    private val isDaily: Boolean,
    private val onDismissCallback: () -> Unit = {}
) : Dialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_win)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCancelable(false)

        val tvAvatar = findViewById<TextView>(R.id.tvWinAvatar)
        tvAvatar?.text = member.groupIconEmoji
        try {
            val bg = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(Color.parseColor(member.avatarBgColor))
            }
            tvAvatar?.background = bg
        } catch (e: Exception) {
            tvAvatar?.setBackgroundResource(R.drawable.bg_gradient_button)
        }

        findViewById<TextView>(R.id.tvWinMemberName)?.text = member.name
        findViewById<TextView>(R.id.tvWinGroupAndRole)?.text = "${member.groupIconEmoji} ${member.group} • ${member.roleDisplay}"
        findViewById<TextView>(R.id.tvWinAttempts)?.text = attemptCount.toString()
        findViewById<TextView>(R.id.tvWinPoints)?.text = "+$pointsEarned"

        findViewById<Button>(R.id.btnShareResult)?.setOnClickListener {
            val shareText = if (isDaily) {
                "🎤 Popdle Günlük T-Pop Tahmini: $attemptCount denemede bildim! 🌟\nGizli Yıldız: ${member.name} (${member.groupIconEmoji} ${member.group})\nSen de Manifest, Crush, Karma ve diğer T-Pop gruplarını keşfet!"
            } else {
                "🎤 Popdle Pratik Modu: ${member.name} (${member.groupIconEmoji} ${member.group}) üyesini $attemptCount tahminde buldum! (+${pointsEarned} Puan)"
            }

            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, shareText)
                type = "text/plain"
            }
            context.startActivity(Intent.createChooser(sendIntent, "Popdle Skorunu Paylaş"))
        }

        findViewById<Button>(R.id.btnWinDialogDismiss)?.setOnClickListener {
            dismiss()
            onDismissCallback()
        }
    }
}
