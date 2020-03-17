@file:JsModule("@material-ui/lab/TreeView")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface TreeViewProps: CommonMaterialProps {

    /**
     * Description: The default icon used to collapse the node.
     */
    var defaultCollapseIcon: dynamic

    /**
     * Description: The default icon displayed next to a end node. This is applied to all tree nodes and can be
     * overridden by the TreeItem icon prop.
     */
    var defaultEndIcon: dynamic

    /**
     * Default: []
     *
     * Description: Expanded node ids. (Uncontrolled)
     */
    var defaultExpanded: Array<String>

    /**
     * Description: The default icon used to expand the node.
     */
    var defaultExpandIcon: dynamic

    /**
     * Description: The default icon displayed next to a parent node. This is applied to all parent nodes and can be
     * overridden by the TreeItem icon prop.
     */
    var defaultParentIcon: dynamic

    /**
     * Description: Expanded node ids. (Controlled)
     */
    var expanded: Array<String>

    /**
     * Description: Callback fired when tree items are expanded/collapsed.
     */
    var onNodeToggle: (Event, Array<String>) -> Unit

}

@JsName("default") // because it was exported as default
external val TreeView : RClass<TreeViewProps>
