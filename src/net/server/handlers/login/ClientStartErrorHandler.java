package net.server.handlers.login;

import client.MapleClient;
import net.AbstractMaplePacketHandler;
import tools.FilePrinter;
import tools.data.input.SeekableLittleEndianAccessor;

public final class ClientStartErrorHandler extends AbstractMaplePacketHandler {

    @Override
    public boolean validateState(MapleClient c) {
        return !c.isLoggedIn();
    }

    @Override
    public final void handlePacket(SeekableLittleEndianAccessor slea, MapleClient c) {
        String str = slea.readMapleAsciiString();
        FilePrinter.printError(FilePrinter.ERROR38, str);
    }
}
