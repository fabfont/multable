@file:JsModule("@material-ui/core/Tabs")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface TabsProps: CommonMaterialProps {

    /**
     * Description: Callback fired when the component mounts.
     * This is useful when you want to trigger an action programmatically.
     * It supports two actions: updateIndicator() and updateScrollButtons()
     */
    var action: dynamic

    /**
     * Default: false
     *
     * Description: If true, the tabs will be centered. This property is intended for large views.
     */
    var centered: Boolean

    /**
     * Default: 'div'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    /**
     * One of:
     *  - 'primary'
     *  - 'secondary'
     *
     * Default: 'secondary'
     *
     * Description: Determines the color of the indicator.
     */
    var indicatorColor: String

    /**
     * Description: Callback fired when the value changes.
     */
    var onChange: (Event, Any) -> Unit

    /**
     * One of:
     *  - 'horizontal'
     *  - 'vertical'
     *
     * Default: 'horizontal
     *
     * Description: The tabs orientation (layout flow direction).
     */
    var orientation: String

    /**
     * Default: TabScrollButton
     *
     * Description: The component used to render the scroll buttons.
     */
    var ScrollButtonComponent: dynamic


    /**
     * One of:
     *  - 'auto'
     *  - 'desktop'
     *  - 'on'
     *  - 'off'
     *
     * Defautl: 'auto'
     *
     * Description: Determine behavior of scroll buttons when tabs are set to scroll:
     *  - auto will only present them when not all the items are visible.
     *  - desktop will only present them on medium and larger viewports.
     *  - on will always present them.
     *  - off will never present them.
     */
    var scrollButtons: String

    /**
     * Default: {}
     *
     * Description: Props applied to the tab indicator element.
     */
    var TabIndicatorProps: Any


    /**
     * One of:
     *  - 'secondary'
     *  - 'primary'
     *  - 'inherit'
     *
     * Default: 'inherit'
     *
     * Description: Determines the color of the Tab.
     */
    var textColor: String


    /**
     * Description: The value of the currently selected Tab. If you don't want any selected Tab, you can set this
     * property to false.
     */
    var value: Any?

    /**
     * One of:
     * - 'standard'
     * - 'scrollable'
     * - 'fullWidth'
     *
     * Default: 'standard'
     *
     * Description: Determines additional display behavior of the tabs:
     *   - scrollable will invoke scrolling properties and allow for horizontally scrolling (or swiping) of the tab
     *   bar.
     *   -fullWidth will make the tabs grow to use all the available space, which should be used for small views,
     *   like on mobile.
     *   - standard will render the default state.
     */
    var variant: String
}

@JsName("default") // because it was exported as default
external val Tabs : RClass<TabsProps>
