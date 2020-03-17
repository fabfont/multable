@file:JsModule("@material-ui/core/Box")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface BoxProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, the box will recycle its children DOM element. It's using React.cloneElement internally.
     */
    var clone: Boolean

    /**
     * Default: 'div'
     *
     * Description: The component used for the root node. Either a string to use a DOM element or a component.
     */
    var component: String

    var onDoubleClick: (Event) -> Unit

    var border: Int
    var borderTop: Int
    var borderLeft: Int
    var borderRight: Int
    var borderBottom: Int
    var borderColor: String
    var borderRadius: String

    var boxShadow: Int

    var display: String

    var justifyContent: String
    var alignItems: String
}

@JsName("default") // because it was exported as default
external val Box : RClass<BoxProps>
