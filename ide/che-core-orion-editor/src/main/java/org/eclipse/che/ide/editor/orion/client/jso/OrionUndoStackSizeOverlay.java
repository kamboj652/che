/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.editor.orion.client.jso;

import com.google.gwt.core.client.JavaScriptObject;

public class OrionUndoStackSizeOverlay extends JavaScriptObject {

  protected OrionUndoStackSizeOverlay() {}

  public final native int getRedo() /*-{
        return this.redo;
    }-*/;

  public final native int getUndo() /*-{
        return this.undo;
    }-*/;
}
