@file:JsModule("@material-ui/core/Tooltip")
@file:JsNonModule
package com.truelines.material


import org.w3c.dom.events.Event
import react.RClass


external interface TooltipProps: CommonMaterialProps {

    /**
     * Default: 'false'
     *
     * Description: Do not respond to focus events.
     */
    var disableFocusListener: Boolean


    /**
     * Default: 'false'
     *
     * Description: Do not respond to hover events.
     */
    var disableHoverListener: Boolean

    /**
     * Default: 'false'
     *
     * Description: Do not respond to long press touch events.
     */
    var disableTouchListener: Boolean

    /**
     * Default: 0
     *
     * Description: The number of milliseconds to wait before showing the tooltip. This prop won't impact the enter
     * touch delay (enterTouchDelay).
     */
    var enterDelay: Int

    /**
     * Default: 700
     *
     * Description: The number of milliseconds a user must touch the element before showing the tooltip.
     */
    var enterTouchDelay: Int

    /**
     * Default: 'false'
     *
     * Description: Makes a tooltip interactive, i.e. will not close when the user hovers over the tooltip before the
     * leaveDelay is expired.
     */
    var interactive: Boolean

    /**
     * Default: 0
     *
     * Description: The number of milliseconds to wait before hiding the tooltip. This prop won't impact the leave
     * touch delay (leaveTouchDelay).
     */
    var leaveDelay: Int

    /**
     * Default: 1500
     *
     * Description: The number of milliseconds after the user stops touching an element before hiding the tooltip.
     */
    var leaveTouchDelay: Int


    /**
     * Default: 'false'
     *
     * Description: If true, the tooltip is shown.
     */
    var open: Boolean


    /**
     * One of:
     * 'bottom-end'
     * 'bottom-start'
     * 'bottom'
     * 'left-end'
     * 'left-start'
     * 'left'
     * 'right-end'
     * 'right-start'
     * 'right'
     * 'top-end'
     * 'top-start'
     * 'top'
     *
     * Default: 'bottom'
     *
     * Description: tooltip placement
     */
    var placement: String

    /**
     * Description: Callback fired when the component requests to be open.
     */
    var onOpen: (Event) -> Unit

    /**
     * Description: Callback fired when the component requests to be closed.
     */
    var onClose: (Event) -> Unit

    /**
     * Description: Tooltip text to be displayed
     */
    var title: String

}

@JsName("default") // because it was exported as default
external val Tooltip : RClass<TooltipProps>
