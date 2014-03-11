/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at legal-notices/CDDLv1_0.txt
 * or http://forgerock.org/license/CDDLv1.0.html.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at legal-notices/CDDLv1_0.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information:
 *      Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 *
 *
 *      Copyright 2009 Sun Microsystems, Inc.
 *      Portions Copyright 2014 ForgeRock AS
 */

package org.opends.server.api.plugin;



import java.util.List;
import java.util.Set;

import org.forgerock.i18n.LocalizableMessage;
import org.opends.server.admin.std.server.PluginCfg;
import org.forgerock.opendj.config.server.ConfigException;
import org.opends.server.types.DN;
import org.opends.server.types.InitializationException;



/**
 * An internal directory server plugin which can be registered with
 * the server without requiring any associated configuration.
 */
public abstract class InternalDirectoryServerPlugin extends
    DirectoryServerPlugin<PluginCfg>
{

  /**
   * Creates a new internal directory server plugin using the provided
   * component name and plugin types.
   *
   * @param componentDN
   *          The configuration entry name of the component associated
   *          with this internal plugin.
   * @param pluginTypes
   *          The set of plugin types for which this internal plugin
   *          is registered.
   * @param invokeForInternalOps
   *          Indicates whether this internal plugin should be invoked
   *          for internal operations.
   */
  protected InternalDirectoryServerPlugin(DN componentDN,
      Set<PluginType> pluginTypes, boolean invokeForInternalOps)
  {
    initializeInternal(componentDN, pluginTypes,
        invokeForInternalOps);
  }



  /**
   * {@inheritDoc}
   */
  public final void initializePlugin(Set<PluginType> pluginTypes,
      PluginCfg configuration) throws ConfigException,
      InitializationException
  {
    // Unused.
  }



  /**
   * {@inheritDoc}
   */
  public final boolean isConfigurationAcceptable(
      PluginCfg configuration, List<LocalizableMessage> unacceptableReasons)
  {
    // Unused.
    return true;
  }

}
