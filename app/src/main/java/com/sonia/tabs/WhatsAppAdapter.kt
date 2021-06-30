package com.sonia.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.sonia.tabs.Views.CallsFragment
import com.sonia.tabs.Views.ChatsFragment
import com.sonia.tabs.Views.StatusFragment


class WhatsAppAdapter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
           0 -> return  "Chats"
            1 -> return "Status"
            2 -> return "Call"
            else -> return "Chats"
        }
    }

    override fun getCount(): Int {
        return  3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatsFragment()
            1 -> return StatusFragment()
            2 -> return CallsFragment()
            else -> return  ChatsFragment()
        }
    }
}