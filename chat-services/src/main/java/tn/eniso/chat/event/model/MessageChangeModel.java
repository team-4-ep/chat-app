package tn.eniso.chat.event.model;

public class MessageChangeModel {

    private String code;

	private String message;

    private String type;
    
    private String to;
	
    public MessageChangeModel() {
		super();
    }
    public MessageChangeModel(String code, String message, String type, String to) {
		super();
		this.code = code;
		this.message = message;
		this.type = type;
		this.to = to;
	}

    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "MessageChangeModel [code=" + code +
				", message=" + message + 
				", type=" + type + "]";
	}
}
