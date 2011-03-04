/*
 * Copyright 2009 University of Zurich, Switzerland
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
package org.evolizer.changedistiller.treedifferencing.operation;

import org.evolizer.changedistiller.treedifferencing.Node;
import org.evolizer.changedistiller.treedifferencing.TreeEditOperation;

/**
 * Representation of the delete basic {@link TreeEditOperation}.
 * 
 * @author Beat Fluri
 * 
 */
public class DeleteOperation implements TreeEditOperation {

    private Node fNodeToDelete;
    private Node fParent;
    private boolean fApplied;

    /**
     * Creates a new delete operation.
     * 
     * @param nodeToDelete
     *            the node to delete
     */
    public DeleteOperation(Node nodeToDelete) {
        fNodeToDelete = nodeToDelete;
        fParent = (Node) fNodeToDelete.getParent();
    }

    @Override
    public void apply() {
        if (!fApplied) {
            fNodeToDelete.removeFromParent();
            fApplied = true;
        }
    }

    public Node getNodeToDelete() {
        return fNodeToDelete;
    }

    public Node getParentNode() {
        return fParent;
    }

    public OperationType getOperationType() {
        return OperationType.DELETE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--Delete operation--\n");
        sb.append("Node to delete: ");
        sb.append(fNodeToDelete.toString() + " (" + fNodeToDelete.getLabel() + ")");
        return sb.toString();
    }
}
