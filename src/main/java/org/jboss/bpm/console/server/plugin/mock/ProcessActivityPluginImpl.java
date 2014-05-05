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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.jboss.bpm.console.server.plugin.ProcessActivityPlugin;

/**
 * ProcessActivityPlugin impl.
 *
 * @author eric.wittmann@redhat.com
 */
public class ProcessActivityPluginImpl implements ProcessActivityPlugin {

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessActivityPlugin#getProcessImage(java.lang.String)
     */
    @Override
    public byte[] getProcessImage(String definitionId) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        
        try {
            is = getClass().getResourceAsStream("process-image.jpg");
            byte [] buff = new byte[256];
            int numBytes = -1;
            while ((numBytes = is.read(buff)) != -1) {
                baos.write(buff, 0, numBytes);
            }
            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                baos.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @see org.jboss.bpm.console.server.plugin.ProcessActivityPlugin#getProcessInstanceImage(java.lang.String, java.lang.String)
     */
    @Override
    public byte[] getProcessInstanceImage(String definition, String instanceId) {
        return getProcessImage(definition);
    }

}
