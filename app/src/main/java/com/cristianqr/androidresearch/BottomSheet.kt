package com.cristianqr.androidresearch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet(var resource: Int): BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState);

//        var view = inflater.inflate(R.layout.botton_sheet_layout, null, false);
//        var view = inflater.inflate(resource, null, false);
        var view = RelativeLayout(this.context)
//        view.layoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
        var label = TextView(this.context)
        label.setText("Cristian")
        view.addView(label)

        return view
    }
}