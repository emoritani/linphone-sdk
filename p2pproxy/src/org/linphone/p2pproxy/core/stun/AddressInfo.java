/*
p2pproxy Copyright (C) 2007  Jehan Monnier ()

AddressInfo.java - .

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.linphone.p2pproxy.core.stun;

import java.net.InetSocketAddress;

public class AddressInfo {
   enum Mode {
        open
      , blockedUDP
      , fullCone
      , restrictedCone
      , portRestrictedCone
      , symmetric
      , symmetricUDPFirewall
      , unknown
   }
   private final InetSocketAddress mPrivateAddress;
   private InetSocketAddress mPublicAddress;
   private Mode mMode = Mode.unknown;
   
   AddressInfo(InetSocketAddress aPrivateAddress) {
      mPrivateAddress = aPrivateAddress;
   }
   public Mode getType() {
      return mMode;
   }
   public void setMode(Mode aMode) {
      mMode = aMode;
   }
   public InetSocketAddress getPrivateAddress() {
      return mPrivateAddress;
   }
   public InetSocketAddress getPublicAddress() {
      return mPrivateAddress;
   }
}
