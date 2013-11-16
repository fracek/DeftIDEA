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

package org.dylanfoundry.deft.filetypes.dylan.psi.impl;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import org.apache.xmlbeans.impl.common.ResolverUtil;
import org.dylanfoundry.deft.filetypes.dylan.psi.DylanVariableName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DylanVariableNameReferenceImpl extends PsiReferenceBase<DylanVariableName> {
  public DylanVariableNameReferenceImpl(DylanVariableName element, TextRange range) {
    super(element, range);
  }

  @Nullable
  @Override
  public PsiElement resolve() {
    DylanVariableProcessor processor = new DylanVariableProcessor(myElement.getText(), myElement);
    DylanVariableName result = processor.getResult();
    return null;
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    return new Object[0];
  }
}
