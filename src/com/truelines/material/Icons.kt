@file:JsModule("@material-ui/icons")
@file:JsNonModule
package com.truelines.material

import react.RClass
import react.RProps

external interface IconsProps: RProps {

    /**
     * CSS style
     */
    var style: dynamic
}

@JsName("Menu")
external val MenuIcon : RClass<IconsProps>

@JsName("HelpOutline")
external val HelpIcon : RClass<IconsProps>

@JsName("NotificationsNone")
external val NotificationsNoneIcon : RClass<IconsProps>

@JsName("Notifications")
external val NotificationsIcon : RClass<IconsProps>

@JsName("AccountCircle")
external val AccountIcon : RClass<IconsProps>

@JsName("Add")
external val AddIcon : RClass<IconsProps>

@JsName("Edit")
external val EditIcon : RClass<IconsProps>

@JsName("ExpandMore")
external val ExpandMore: RClass<IconsProps>

@JsName("ChevronRight")
external val ChevronRight: RClass<IconsProps>

@JsName("Delete")
external val Delete: RClass<IconsProps>

@JsName("DeleteForever")
external val DeleteForever: RClass<IconsProps>

@JsName("DeleteOutline")
external val DeleteOutline: RClass<IconsProps>

@JsName("FilterList")
external val FilterList: RClass<IconsProps>

@JsName("Sort")
external val Sort: RClass<IconsProps>

@JsName("FilterNoneOutlined")
external val FilterNoneOutlined: RClass<IconsProps>

@JsName("Search")
external val Search: RClass<IconsProps>

@JsName("Link")
external val LinkIcon: RClass<IconsProps>