/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

package kotlin.reflect

import kotlin.native.internal.*

@Retention(value = AnnotationRetention.BINARY)
@Experimental(level = Experimental.Level.ERROR)
annotation class ExperimentalAssociatedObjects

@ExperimentalAssociatedObjects
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class AssociatedObjectKey

@ExperimentalAssociatedObjects
inline fun <reified T> KClass<*>.findAssociatedObject(): Any? =
        this.findAssociatedObject(T::class)
