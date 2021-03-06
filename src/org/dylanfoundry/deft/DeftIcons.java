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

package org.dylanfoundry.deft;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class DeftIcons {
  private static Icon load(String path) {
    return IconLoader.getIcon(path, DeftIcons.class);
  }

  public static final Icon DYLAN_FILE = load("/org/dylanfoundry/deft/icons/file_dylan_16.png"); // 16x16
  public static final Icon MELANGE_INTERFACE_FILE = load("/org/dylanfoundry/deft/icons/file_intr_16.png"); // 16x16
  public static final Icon LID_FILE = load("/org/dylanfoundry/deft/icons/file_lid_16.png"); // 16x16
}

