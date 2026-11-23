package App.dao.entities;

public class Client {
    private String clientId;
    private String clientName;
    private String contactPerson;
    private String phone;
    private String address;

    public Client() {
    }

    public Client(String clientId, String clientName, String contactPerson) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.contactPerson = contactPerson;
    }

    public Client(String clientId, String clientName, String contactPerson, String phone, String address) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.address = address;
    }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getContactPerson() { return contactPerson; }
    public void setContactPerson(String contactPerson) { this.contactPerson = contactPerson; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return clientName != null ? clientName : "";

    }
}