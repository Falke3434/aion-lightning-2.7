/*
 * This file is part of InPanic Core <Ver:3.1>.
 *
 *  InPanic-Core is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  InPanic-Core is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with InPanic-Core.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.chatserver.network.netty.coder;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 * @author ATracer
 */
public class LoginPacketEncoder extends OneToOneEncoder {

	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel arg1, Object arg2) throws Exception {
		ChannelBuffer message = (ChannelBuffer) arg2;

		int size = message.readableBytes();
		message.setShort(0, (short) (size));
		return message;
	}
}
