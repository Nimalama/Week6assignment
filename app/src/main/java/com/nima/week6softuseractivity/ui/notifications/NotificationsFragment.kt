package com.nima.week6softuseractivity.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.nima.week6softuseractivity.R


class NotificationsFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var view= inflater.inflate(R.layout.fragment_notifications, container, false)
        var web: WebView = view.findViewById(R.id.webview)
        web.loadUrl("https://softwarica.edu.np/")
        return view
    }
}