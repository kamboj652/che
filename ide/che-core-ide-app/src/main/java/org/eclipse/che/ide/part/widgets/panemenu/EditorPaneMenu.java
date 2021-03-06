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
package org.eclipse.che.ide.part.widgets.panemenu;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.ImplementedBy;
import javax.validation.constraints.NotNull;
import org.eclipse.che.ide.api.parts.EditorPartStack;

/**
 * Contract for menu for managing opened editors for corresponding {@link EditorPartStack}.
 *
 * @author Roman Nikitenko
 */
@ImplementedBy(EditorPaneMenuWidget.class)
public interface EditorPaneMenu extends IsWidget {

  /** Displays the editor pane menu */
  void show();

  /** Hides the editor pane menu */
  void hide();

  /** Adds given item to pane menu without separator */
  void addItem(@NotNull EditorPaneMenuItem item);

  /**
   * Adds given item to pane menu
   *
   * @param item item to adding
   * @param isSeparated a separator will be added when {@code isSeparated} is set as {@code true}
   */
  void addItem(@NotNull EditorPaneMenuItem item, boolean isSeparated);

  /** Removes given item from pane menu */
  void removeItem(@NotNull EditorPaneMenuItem item);
}
