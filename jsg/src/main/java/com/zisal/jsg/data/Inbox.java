package com.zisal.jsg.data;

import javax.persistence.*;
import java.util.Date;

/**
 * created on 11/10/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Entity
@Table(name = "inbox")
public class Inbox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UpdatedInDB")
    @Temporal(TemporalType.DATE)
    private Date updatedInDB;

    @Column(name = "ReceivingDateTime")
    @Temporal(TemporalType.DATE)
    private Date receivingDateTime;

    @Column(name = "Text")
    private String text;

    @Column(name = "SenderNumber")
    private String senderNumber;

    @Column(name = "Coding")
    private Enum coding;

    @Column(name = "UDH")
    private String UDH;

    @Column(name = "SMSCNumber")
    private String SMSCNumber;

    @Column(name = "Class")
    private Integer classInbox;

    @Column(name = "TextDecoded")
    private String textDecoded;

    @Column(name = "RecipientID")
    private String recipientId;

    @Column(name = "Processed")
    private Enum processed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpdatedInDB() {
        return updatedInDB;
    }

    public void setUpdatedInDB(Date updatedInDB) {
        this.updatedInDB = updatedInDB;
    }

    public Date getReceivingDateTime() {
        return receivingDateTime;
    }

    public void setReceivingDateTime(Date receivingDateTime) {
        this.receivingDateTime = receivingDateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public Enum getCoding() {
        return coding;
    }

    public void setCoding(Enum coding) {
        this.coding = coding;
    }

    public String getUDH() {
        return UDH;
    }

    public void setUDH(String UDH) {
        this.UDH = UDH;
    }

    public String getSMSCNumber() {
        return SMSCNumber;
    }

    public void setSMSCNumber(String SMSCNumber) {
        this.SMSCNumber = SMSCNumber;
    }

    public Integer getClassInbox() {
        return classInbox;
    }

    public void setClassInbox(Integer classInbox) {
        this.classInbox = classInbox;
    }

    public String getTextDecoded() {
        return textDecoded;
    }

    public void setTextDecoded(String textDecoded) {
        this.textDecoded = textDecoded;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public Enum getProcessed() {
        return processed;
    }

    public void setProcessed(Enum processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "Inbox{" +
                "id=" + id +
                ", updatedInDB='" + updatedInDB + '\'' +
                ", receivingDateTime='" + receivingDateTime + '\'' +
                ", text='" + text + '\'' +
                ", senderNumber='" + senderNumber + '\'' +
                ", coding=" + coding +
                ", UDH='" + UDH + '\'' +
                ", SMSCNumber='" + SMSCNumber + '\'' +
                ", classInbox=" + classInbox +
                ", textDecoded='" + textDecoded + '\'' +
                ", recipientId='" + recipientId + '\'' +
                ", processed=" + processed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inbox inbox = (Inbox) o;

        if (SMSCNumber != null ? !SMSCNumber.equals(inbox.SMSCNumber) : inbox.SMSCNumber != null) return false;
        if (UDH != null ? !UDH.equals(inbox.UDH) : inbox.UDH != null) return false;
        if (classInbox != null ? !classInbox.equals(inbox.classInbox) : inbox.classInbox != null) return false;
        if (coding != null ? !coding.equals(inbox.coding) : inbox.coding != null) return false;
        if (id != null ? !id.equals(inbox.id) : inbox.id != null) return false;
        if (processed != null ? !processed.equals(inbox.processed) : inbox.processed != null) return false;
        if (receivingDateTime != null ? !receivingDateTime.equals(inbox.receivingDateTime) : inbox.receivingDateTime != null)
            return false;
        if (recipientId != null ? !recipientId.equals(inbox.recipientId) : inbox.recipientId != null) return false;
        if (senderNumber != null ? !senderNumber.equals(inbox.senderNumber) : inbox.senderNumber != null) return false;
        if (text != null ? !text.equals(inbox.text) : inbox.text != null) return false;
        if (textDecoded != null ? !textDecoded.equals(inbox.textDecoded) : inbox.textDecoded != null) return false;
        if (updatedInDB != null ? !updatedInDB.equals(inbox.updatedInDB) : inbox.updatedInDB != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (updatedInDB != null ? updatedInDB.hashCode() : 0);
        result = 31 * result + (receivingDateTime != null ? receivingDateTime.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (senderNumber != null ? senderNumber.hashCode() : 0);
        result = 31 * result + (coding != null ? coding.hashCode() : 0);
        result = 31 * result + (UDH != null ? UDH.hashCode() : 0);
        result = 31 * result + (SMSCNumber != null ? SMSCNumber.hashCode() : 0);
        result = 31 * result + (classInbox != null ? classInbox.hashCode() : 0);
        result = 31 * result + (textDecoded != null ? textDecoded.hashCode() : 0);
        result = 31 * result + (recipientId != null ? recipientId.hashCode() : 0);
        result = 31 * result + (processed != null ? processed.hashCode() : 0);
        return result;
    }
}
