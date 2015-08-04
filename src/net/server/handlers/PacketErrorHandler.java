/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.server.handlers;

import client.MapleClient;
import net.MaplePacketHandler;
import tools.data.input.SeekableLittleEndianAccessor;
import tools.FilePrinter;
import tools.HexTool;


/**
 *
 * @author Administrator
 */
public class PacketErrorHandler implements MaplePacketHandler {
        public void handlePacket(SeekableLittleEndianAccessor slea, MapleClient c) {
        		if (slea.available() >= 6) {
			slea.skip(6);
			short badPacketSize = slea.readShort();
			// skipping cause i don't know what the rest means... slea.skip(2) is always equal to slea.skip(4) ..
			slea.skip(4); // skips all the way to the broken packet
			System.err.println("Packet error detected! Please check Error38.log");
			slea.skip(badPacketSize);
			FilePrinter.printError(FilePrinter.ERROR38, slea.toString());
		} else {
			System.err.println("ERROR : Detected packet error but unable to handle!!");
		}
    }

    public boolean validateState(MapleClient c) {
        return true;
    }
}
