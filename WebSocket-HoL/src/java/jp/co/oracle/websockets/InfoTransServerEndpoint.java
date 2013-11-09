/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.oracle.websockets;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author ynak
 */
@ServerEndpoint("/infotrans")
public class InfoTransServerEndpoint {

    @OnOpen
    public void initOpen(Session session) {
        System.out.println("Connected!!");
    }

    @OnClose
    public void closeWebSocket(Session session) {
        System.out.println("Disconnected!!");
    }
}
