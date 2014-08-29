package org.ethereum.trie;

import java.util.HashSet;
import java.util.Set;

/**
 * www.ethereumJ.com
 *
 * @author: Roman Mandeleil
 * Created on: 29/08/2014 10:46
 */

public class CollectFullSetOfNodes implements Trie.ScanAction {
    Set<byte[]> nodes = new HashSet<>();

    @Override
    public void doOnNode(byte[] hash) {
        nodes.add(hash);
    }

    public Set<byte[]> getCollectedHashes(){
        return nodes;
    }
}
