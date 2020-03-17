@file:JsModule("@material-ui/core/ExpansionPanel")
@file:JsNonModule
package com.truelines.material

import org.w3c.dom.events.Event
import react.RClass


external interface ExpansionPanelProps: CommonMaterialProps {

    /**
     * Default: false
     *
     * Description: If true, expands the panel by default.
     */
    var defaultExpanded: Boolean

    /**
     * Default: false
     *
     * Description: If true, the panel will be displayed in a disabled state.
     */
    var disabled: Boolean

    /**
     * Description: If true, expands the panel, otherwise collapse it. Setting this prop enables control over the panel.
     */
    var expanded: Boolean

    /**
     * Description: Callback fired when the expand/collapse state is changed.
     */
    var onChange: (Event) -> Unit

}

@JsName("default") // because it was exported as default
external val ExpansionPanel : RClass<ExpansionPanelProps>
