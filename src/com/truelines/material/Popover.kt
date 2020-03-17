@file:JsModule("@material-ui/core/Popover")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface PopoverProps: CommonMaterialProps {

    /**
     * One of:
     * 'regular'
     * 'dense'
     *
     * Default: 'regular'
     *
     * Description: The variant to use.
     */
    var variant: String

    /**
     * Description: This is the DOM element, or a function that returns the DOM element,
     * that may be used to set the position of the popover.
     */
    var anchorEl: dynamic

    /**
     * Description: This is the point on the anchor where the popover's anchorEl will attach to.
     * This is not used when the anchorReference is 'anchorPosition'.
     * Options: vertical: [top, center, bottom]; horizontal: [left, center, right].
     */
    var anchorOrigin: dynamic

    /**
     * Description: This is the position that may be used to set the position of the popover.
     * The coordinates are relative to the application's client area.
     */
    var anchorPosition: dynamic

    /**
     * Default: 8
     *
     * Description: The elevation of the popover.
     */
    var elevation: Int

    /**
     * Default: 16
     *
     * Description: Specifies how close to the edge of the window the popover can appear.
     */
    var marginThreshold: Int

    /**
     * Description: Callback fired before the component is entering.
     */
    var onEnter: (Event) -> Unit

    /**
     * Description: Callback fired when the component has entered.
     */
    var onEntered: (Event) -> Unit

    /**
     * Description: Callback fired when the component is entering.
     */
    var onEntering: (Event) -> Unit

    /**
     * Description: Callback fired before the component is exiting.
     */
    var onExit: (Event) -> Unit

    /**
     * Description: Callback fired when the component has exited.
     */
    var onExited: (Event) -> Unit

    /**
     * Description: Callback fired when the component is exiting.
     */
    var onExiting: (Event) -> Unit

    /**
     * Description: Props applied to the Paper element.
     */
    var PaperProps: dynamic

    /**
     * Description: This is the point on the popover which will attach to the anchor's origin.
     * Options: vertical: [top, center, bottom, x(px)]; horizontal: [left, center, right, x(px)].
     */
    var transformOrigin: dynamic

    /**
     * Default: Grow
     *
     * Description: The component used for the transition.
     */
    var TransitionComponent: dynamic

    /**
     * One of:
     *  - number
     *  - { enter?: number, exit?: number }
     *  - 'auto'
     *
     * Default: 'auto'
     *
     * Description: Set to 'auto' to automatically calculate transition time based on height.
     */
    var transitionDuration: dynamic

    /**
     * Description: Props applied to the Transition element.
     */
    var TransitionProps: dynamic

    /**
     * Description: if true, the popover is visible
     */
    var open: Boolean

    /**
     * Default: false
     *
     * Description: If true, clicking the backdrop will not fire any callback.
     */
    var disableBackdropClick: Boolean

    /**
     * Description: Action performed when clicking on the backdrop
     */
    var onBackdropClick: (Event) -> Unit

    var onKeyDown: (Event)->Unit

    var disablePortal: Boolean
}

@JsName("default") // because it was exported as default
external val Popover : RClass<PopoverProps>
