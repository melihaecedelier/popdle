package com.tpop.popdle.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button
import com.tpop.popdle.R

class HowToPlayDialog(context: Context) : Dialog(context) {

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_how_to_play)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCancelable(true)

        findViewById<Button>(R.id.btnCloseHowToPlay)?.setOnClickListener {
            dismiss()
        }
    }
}
