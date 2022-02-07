package com.orlandev.jcompose_tests.extensions

import com.orlandev.jcompose_tests.JComponents

fun String.toJCompnents(listJComponents: List<JComponents>): JComponents? =
    listJComponents.firstOrNull { it.componentName == this@toJCompnents }
