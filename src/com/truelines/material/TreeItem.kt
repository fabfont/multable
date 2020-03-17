@file:JsModule("@material-ui/lab/TreeItem")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface TreeItemProps: CommonMaterialProps {

    /**
     * Description: The icon used to collapse the node.
     */
    var collapseIcon: dynamic

    /**
     * Description: The icon displayed next to a end node.
     */
    var endIcon: dynamic

    /**
     * Description: The icon used to expand the node.
     */
    var expandIcon: dynamic

    /**
     * Description: The icon to display next to the tree node's label.
     */
    var icon: dynamic

    /**
     * Description: The tree node label.
     */
    var label: String

    /**
     * Description: The id of the node.
     */
    var nodeId: String

    /**
     * Description: The component used for the transition
     */
    var TransitionComponent: dynamic

    var onClick: (Event) -> Unit

}

@JsName("default") // because it was exported as default
external val TreeItem : RClass<TreeItemProps>
