//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : casino project
//  @ File Name : evtController.java
//  @ Date : 5/27/2012
//  @ Author : sangdn
//
//



package casino.cardgame.controller.game;
import casino.cardgame.message.IGameRequest;
import casino.cardgame.message.event.SFSGameEvent;
import casino.cardgame.message.request.SFSGameRequest;
import com.smartfoxserver.v2.entities.User;

public interface IGameController{
        //******************* SFS2X API ********************************
        //khoatd edited
	public void HandleGameMessage(SFSGameRequest request);
        //public void HandleGameMessage(User sender,IGameRequest request);
        
	public void HandlePlayerToSpectator(SFSGameEvent evt) ;
	
	public void HandleRoomAdded(SFSGameEvent evt);
	
	public void HandleRoomRemove(SFSGameEvent evt) ;
	
	public void HandleRoomVariableUpdate(SFSGameEvent evt) ;
	
	public void HandleSpectatorToPlayer(SFSGameEvent evt) ;
	
	public void HandleUserDisconnect(SFSGameEvent evt) ;
	
	public void HandlerUserJoinRoom(SFSGameEvent evt) ;
	
	public void HandleUserLeaveRoom(SFSGameEvent evt) ;
	
	public void HandleUserVariableUpdate(SFSGameEvent evt) ;
        public void HandleUserLogout(SFSGameEvent evt) ;
        public void HandleServerReady(SFSGameEvent evt) ;
        
}