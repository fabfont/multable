@file:JsModule("@material-ui/core/Tab")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface TabProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, the tab will be disabled.
     */
    var disabled: Boolean

    /**
     * Default: false
     *
     * Description: If true, the keyboard focus ripple will be disabled. disableRipple must also be true.
     */
    var disableFocusRipple: Boolean

    /**
     * Description: the icon element
     */
    var icon: dynamic

    /**
     * Description: the label element
     */
    var label: Any

    /**
     * Description: You can provide your own value. Otherwise, we fallback to the child position index.
     */
    var value: Any

    /**
     * Default: false
     *
     * Description: Tab labels appear in a single row. They can use a second line if needed.
     */
    var wrapped: Boolean

    /**
     * Default: false
     *
     * Description: If true, the ripple effect will be disabled.
     */
    var disableRipple: Boolean

    var onContextMenu: (Event) -> Unit

    var onClick: (Event) -> Unit
}

@JsName("default") // because it was exported as default
external val Tab : RClass<TabProps>
