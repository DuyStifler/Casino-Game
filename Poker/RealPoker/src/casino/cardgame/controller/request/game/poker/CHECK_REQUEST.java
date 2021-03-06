/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casino.cardgame.controller.request.game.poker;

import casino.cardgame.message.request.game.poker.BetRequest;
import casino.cardgame.message.request.game.poker.CheckRequest;
import casino.cardgame.utils.GlobalValue;
import casino.cardgame.utils.Logger;
import com.smartfoxserver.v2.entities.User;
import com.smartfoxserver.v2.entities.data.ISFSObject;
import com.smartfoxserver.v2.extensions.BaseClientRequestHandler;

/**
 *
 * @author KIDKID
 * Desc: User request get next card from table card collection to user card collection
 */
public class CHECK_REQUEST extends BaseClientRequestHandler{

    @Override
    public void handleClientRequest(User user, ISFSObject isfso) {
        try{
            //khoatd
            CheckRequest request = new CheckRequest();
            request.setM_user(user);
            request.FromSFSObject(isfso);
            GlobalValue.serverHandler.HandleGameMessage(request);
        }catch(Exception ex){
            Logger.error(this.getClass(), ex);
        }
    }
    
}
