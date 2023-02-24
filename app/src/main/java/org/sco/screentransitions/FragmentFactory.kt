package org.sco.screentransitions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory


class FragmentFactory() : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (loadFragmentClass(classLoader, className)) {
            FragmentTwo::class.java -> FragmentTwo()
            FragmentThree::class.java -> FragmentThree()
            else -> super.instantiate(classLoader, className)
        }
    }
}