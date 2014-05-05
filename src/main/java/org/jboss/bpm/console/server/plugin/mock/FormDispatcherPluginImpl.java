/*
 * Copyright 2013 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.bpm.console.server.plugin.mock;

import java.net.URL;

import javax.activation.DataHandler;

import org.jboss.bpm.console.server.plugin.FormAuthorityRef;
import org.jboss.bpm.console.server.plugin.FormDispatcherPlugin;

/**
 * FormDispatcherPlugin impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class FormDispatcherPluginImpl implements FormDispatcherPlugin {

    /**
     * @see org.jboss.bpm.console.server.plugin.FormDispatcherPlugin#getDispatchUrl(org.jboss.bpm.console.server.plugin.FormAuthorityRef)
     */
    @Override
    public URL getDispatchUrl(FormAuthorityRef ref) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.FormDispatcherPlugin#provideForm(org.jboss.bpm.console.server.plugin.FormAuthorityRef)
     */
    @Override
    public DataHandler provideForm(FormAuthorityRef ref) {
        // TODO Auto-generated method stub
        return null;
    }

}
