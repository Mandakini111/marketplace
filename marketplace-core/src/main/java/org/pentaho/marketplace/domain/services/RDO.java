/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2015 - 2017 Hitachi Vantara. All rights reserved.
 */

package org.pentaho.marketplace.domain.services;

import org.pentaho.marketplace.domain.services.interfaces.IPluginService;
import org.pentaho.marketplace.domain.services.interfaces.IRDO;

public class RDO implements IRDO {

  private IPluginService pluginService;

  //region Constructors
  public RDO( IPluginService pluginService ) {
    this.pluginService = pluginService;
  }
  //endregion

  //region IRDO implementation
  @Override
  public IPluginService getPluginService() {
    return this.pluginService;
  }
  //endregion
}
