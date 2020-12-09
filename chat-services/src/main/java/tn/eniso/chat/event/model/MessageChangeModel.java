package tn.eniso.chat.event.model;

public class MessageChangeModel {

    private String code;

	private String message;

    private String type;
    
	
    public MessageChangeModel() {
		super();
    }
    public MessageChangeModel(String code, String message, String type) {
		this.code = code;
		this.message = message;
		this.type = type;
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
	@Override
	public String toString() {
		return "MessageChangeModel [code=" + code +
				", message=" + message + 
				", type=" + type + "]";
	}
}
