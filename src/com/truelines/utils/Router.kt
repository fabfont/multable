/*
 *  Copyright (c) 2019 Leonard Management. All rights reserved.
 *
 *  This is an unpublished work of Leonard Management.
 *  It may not be used, copied, disclosed or transferred other than
 *  in accordance with the written permission of Leonard Management.
 */

package com.truelines.utils

import org.w3c.dom.PopStateEvent
import org.w3c.dom.PopStateEventInit
import react.RState
import kotlin.browser.window

object Router {

    // Go to new route
    // This method has been created as it means that the usual ways to do that this the React Router had not been
    // exported to Kotlin
    fun goTo(path: String, state: RState? = null) {
        window.history.pushState(state, "goTo $path", path)
        window.dispatchEvent(PopStateEvent("popstate", PopStateEventInit(state= state)))
    }
}