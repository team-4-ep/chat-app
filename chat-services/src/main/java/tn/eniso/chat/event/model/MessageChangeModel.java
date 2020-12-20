package tn.eniso.chat.event.model;

public class MessageChangeModel {

    private String code;

	private String message;

    private String sender;
    
    private String to;
	
    public MessageChangeModel() {
		super();
    }
    public MessageChangeModel(String code, String message, String sender) {
		super();
		this.code = code;
		this.message = message;
		this.sender = sender;
	}

    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Override
	public String toString() {
		return "MessageChangeModel [code=" + code +
				", message=" + message + 
				", sender=" + sender + "]";
	}
}
