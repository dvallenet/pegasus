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
package edu.isi.pegasus.planner.dax;

/**
 *
 * @author gmehta
 */
public class DAG extends AbstractJob {

    public DAG(String id, String dagname) {
        this(id, dagname, null);
    }

    public DAG(String id, String dagname, String label) {
        super();
        checkID(id);
        // to decide whether to exit. Currently just logging error and proceeding.
        mId = id;
        mName = dagname;
        mNodeLabel = label;
    }
}
