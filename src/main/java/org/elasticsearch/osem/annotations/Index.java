/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.osem.annotations;

/**
 * Specifies whether and how a meta-data proeprty should be indexed.
 *
 * @author kimchy
 */
public enum Index {
    NA,

    /**
     * Do not index the property value. This property can thus not be searched, but one
     * can still access its contents provided it is {@link Store stored}.
     */
    NO,

    /**
     * Index the property's value so it can be searched. An Analyzer will be used to
     * tokenize and possibly further normalize the text before its terms will be stored
     * in the index. This is useful for common text.
     */
    ANALYZED,

    /**
     * Index the property's value without using an Analyzer, so it can be searched.
     * As no analyzer is used the value will be stored as a single term. This is
     * useful for unique Ids like product numbers.
     */
    NOT_ANALYZED,

}
