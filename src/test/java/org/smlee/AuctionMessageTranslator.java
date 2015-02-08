package org.smlee;

public class AuctionMessageTranslator {
	AuctionEventListener listener;
	public AuctionMessageTranslator(AuctionEventListener listener) {
		this.listener = listener;
	}

	public void processMessage(String unusedChat, Message message) {
		
		listener.auctionClosed();
		
	}

}
