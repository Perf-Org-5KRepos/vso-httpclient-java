// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.HashMap;

/** 
 */
public class WorkItemTemplate
    extends WorkItemTemplateReference {

    private HashMap<String, String> fields;

    public HashMap<String, String> getFields() {
        return fields;
    }

    public void setFields(final HashMap<String, String> fields) {
        this.fields = fields;
    }
}
