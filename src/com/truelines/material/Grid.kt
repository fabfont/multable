@file:JsModule("@material-ui/core/Grid")
@file:JsNonModule
package com.truelines.material

import react.RClass


external interface GridProps: CommonMaterialProps {

    /**
     * One of:
     *
     * 'stretch'
     * 'center'
     * 'flex-start'
     * 'flex-end'
     * 'space-between'
     * 'space-around'
     *
     * Default: 'stretch'
     *
     * Description: Defines the align-content style property. It's applied for all screen sizes.
     */
    var alignContent: String

    /**
     * One of:
     *
     * 'flex-start'
     *  'center'
     *  'flex-end'
     *  'stretch'
     *  'baseline'
     *
     *  Default: 'stretch'
     *
     *  Description: Defines the align-items style property. It's applied for all screen sizes.
     */
    var alignItems: String

    /**
     * Override or extend the styles applied to the component. See CSS API below for more details.
     */
    var classes : String

    /**
     * Default: false
     *
     * Description: If true, the component will have the flex container behavior. You should be wrapping items with a
     * container.
     */
    var container: Boolean

    /**
     * One of:
     * 'row'
     * 'row-reverse'
     * 'column'
     * 'column-reverse'
     *
     * Default: 'row'
     *
     * Description: Defines the flex-direction style property. It is applied for all screen sizes.
     */
    var direction: String

    /**
     * Default: false
     *
     * Description: If true, the component will have the flex container behavior. You should be wrapping items with a
     * container.
     */
    var item: Boolean

    /**
     * One of:
     * 'flex-start'
     * 'center'
     * 'flex-end'
     * 'space-between'
     * 'space-around'
     * 'space-evenly'
     *
     * Default: 'flex-start'
     *
     * Description: Defines the justify-content style property. It is applied for all screen sizes.
     */
    var justify: String

    /**
     * One of:
     * 0
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     *
     * Default: 0
     *
     * Description: Defines the space between the type item component. It can only be used on a type container component
     */
    var spacing: Int

    /**
     * One of:
     * false
     * 'auto'
     * true
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     * 11
     * 12
     *
     * Default: false
     *
     * Description: Defines the number of grids the component is going to use. It's applied for the xs breakpoint and
     * wider screens if not overridden.
     */
    var xs: Any

    /**
     * One of:
     * false
     * 'auto'
     * true
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     * 11
     * 12
     *
     * Default: false
     *
     * Description: Defines the number of grids the component is going to use. It's applied for the sm breakpoint and
     * wider screens if not overridden.
     */
    var sm: Any

    /**
     * One of:
     * false
     * 'auto'
     * true
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     * 11
     * 12
     *
     * Default: false
     *
     * Description: Defines the number of grids the component is going to use. It's applied for the md breakpoint and
     * wider screens if not overridden.
     */
    var md: Any

    /**
     * One of:
     * false
     * 'auto'
     * true
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     * 11
     * 12
     *
     * Default: false
     *
     * Description: Defines the number of grids the component is going to use. It's applied for the lg breakpoint and
     * wider screens if not overridden.
     */
    var lg: Any

    /**
     * One of:
     * false
     * 'auto'
     * true
     * 1
     * 2
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     * 10
     * 11
     * 12
     *
     * Default: false
     *
     * Description: Defines the number of grids the component is going to use. It's applied for the xl breakpoint and
     * wider screens if not overridden.
     */
    var xl: Any

    /**
     * One of:
     * 'nowrap'
     * 'wrap'
     * 'wrap-reverse'
     *
     * Default: 'wrap'
     *
     * Description: Defines the flex-wrap style property. It's applied for all screen sizes.
     */
    var wrap: String

    /**
     * Default: false
     *
     * Description: If true, it sets min-width: 0 on the item. Refer to the limitations section of the documentation
     * to better understand the use case.
     */
    var zeroMinWidth: Boolean

}

@JsName("default") // because it was exported as default
external val Grid : RClass<GridProps>

