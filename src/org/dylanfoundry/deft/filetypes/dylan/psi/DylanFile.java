/*
 * Copyright 2013, Bruce Mitchener, Jr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dylanfoundry.deft.filetypes.dylan.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.dylanfoundry.deft.filetypes.dylan.DylanFileType;
import org.dylanfoundry.deft.filetypes.dylan.DylanLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DylanFile extends PsiFileBase {
  public DylanFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, DylanLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return DylanFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return "Dylan File";
  }

  @Override
  public Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}
