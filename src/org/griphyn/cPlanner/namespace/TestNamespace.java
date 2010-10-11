/**
 *  Copyright 2007-2008 University Of Southern California
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.griphyn.cPlanner.namespace;

/**
 * Test Class for namespaces.
 *
 * @author Karan Vahi
 * @version $Revision$
 */

public class TestNamespace {
    public TestNamespace() {
    }

    public static void main(String[] args){
        Condor c = new Condor();
        Pegasus    v = new Pegasus();
        System.out.println(v.namespaceName() + " \n" + v.deprecatedTable());
        System.out.println(c.namespaceName() + " \n" + c.deprecatedTable());
    }
}
