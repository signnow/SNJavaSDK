import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SignNowExampleData {

  private final Properties properties;

  public SignNowExampleData() {
    this.properties = new Properties();
    try (FileInputStream fis = new FileInputStream("examples/signnow-example.properties")) {
      this.properties.load(fis);
    } catch (IOException e) {
      throw new RuntimeException(
          "Failed to load examples/signnow-example.properties. "
              + "Copy signnow-example.properties.example to signnow-example.properties and fill in your values.",
          e);
    }
  }

  public String getBearerToken() {
    return this.properties.getProperty("bearer_token", "");
  }

  public String getPathToDocument() {
    return this.properties.getProperty("path_to_document", "");
  }

  public String getFirstRecipientRole() {
    return this.properties.getProperty("first_recipient_role", "");
  }

  public String getSecondRecipientRole() {
    return this.properties.getProperty("second_recipient_role", "");
  }

  public String getSignAction() {
    return this.properties.getProperty("sign_action", "sign");
  }

  public String getViewAction() {
    return this.properties.getProperty("view_action", "view");
  }

  public String getSenderEmail() {
    return this.properties.getProperty("sender_email", "");
  }

  public String getUserId() {
    return this.properties.getProperty("user_id", "");
  }

  // BulkInviteExample
  public String getBulkInviteTemplateId() {
    return this.properties.getProperty("bulk_invite_template_id", "");
  }

  public String getBulkInviteFolderId() {
    return this.properties.getProperty("bulk_invite_folder_id", "");
  }

  public String getBulkInviteCsvFilePath() {
    return this.properties.getProperty("bulk_invite_csv_file_path", "");
  }

  // DocumentGroupInviteExample
  public String getDocumentGroupInviteSignerRole() {
    return this.properties.getProperty("document_group_invite_signer_role", "");
  }

  public String getDocumentGroupInviteSignerEmail() {
    return this.properties.getProperty("document_group_invite_signer_email", "");
  }

  // DocumentGroupTemplateExample
  public String getDocumentGroupTemplateTemplateGroupId() {
    return this.properties.getProperty("document_group_template_template_group_id", "");
  }

  public String getDocumentGroupTemplateFolderId() {
    return this.properties.getProperty("document_group_template_folder_id", "");
  }

  // DocumentPrefillTextFieldExample
  public String getDocumentPrefillTextFieldSignerRole() {
    return this.properties.getProperty("document_prefill_text_field_signer_role", "");
  }

  // DocumentGetExample
  public String getDocumentId() {
    return this.properties.getProperty("document_id", "");
  }

  // DownloadDocumentGroupExample
  public String getDownloadDocumentGroupDocumentGroupId() {
    return this.properties.getProperty("download_document_group_document_group_id", "");
  }

  public String getDownloadDocumentGroupDocumentId1() {
    return this.properties.getProperty("download_document_group_document_id_1", "");
  }

  public String getDownloadDocumentGroupDocumentId2() {
    return this.properties.getProperty("download_document_group_document_id_2", "");
  }

  // EmbeddedGroupInviteExample
  public String getEmbeddedGroupInviteSigner1Email() {
    return this.properties.getProperty("embedded_group_invite_signer_1_email", "");
  }

  public String getEmbeddedGroupInviteSigner2Email() {
    return this.properties.getProperty("embedded_group_invite_signer_2_email", "");
  }

  // EmbeddedInviteExample
  public String getEmbeddedInviteSignerRole() {
    return this.properties.getProperty("embedded_invite_signer_role", "");
  }

  public String getEmbeddedInviteSignerEmail() {
    return this.properties.getProperty("embedded_invite_signer_email", "");
  }

  public String getEmbeddedInviteSignerFirstName() {
    return this.properties.getProperty("embedded_invite_signer_first_name", "");
  }

  public String getEmbeddedInviteSignerLastName() {
    return this.properties.getProperty("embedded_invite_signer_last_name", "");
  }

  // FieldInviteExample
  public String getFieldInviteSignerEmail() {
    return this.properties.getProperty("field_invite_signer_email", "");
  }

  public String getFieldInviteSignerRole() {
    return this.properties.getProperty("field_invite_signer_role", "");
  }

  // FolderExample
  public String getFolderFolderId() {
    return this.properties.getProperty("folder_folder_id", "");
  }

  // FreeFormInviteExample
  public String getFreeFormInviteSignerEmail() {
    return this.properties.getProperty("free_form_invite_signer_email", "");
  }

  public String getFreeFormInviteDocumentId() {
    return this.properties.getProperty("free_form_invite_document_id", "");
  }

  // WebhookExample
  public String getWebhookCallbackUrl() {
    return this.properties.getProperty("webhook_callback_url", "");
  }

  // DocumentGroupRecipientsExample
  public String getDocumentGroupRecipientsDocumentGroupId() {
    return this.properties.getProperty("document_group_recipients_document_group_id", "");
  }

  public String getDocumentGroupRecipientsDocumentId1() {
    return this.properties.getProperty("document_group_recipients_document_id_1", "");
  }

  public String getDocumentGroupRecipientsDocumentId2() {
    return this.properties.getProperty("document_group_recipients_document_id_2", "");
  }

  // DocumentGroupTemplateRecipientsExample
  public String getDocumentGroupTemplateRecipientsTemplateId() {
    return this.properties.getProperty("document_group_template_recipients_template_id", "");
  }

  public String getDocumentGroupTemplateRecipientsDocumentId1() {
    return this.properties.getProperty("document_group_template_recipients_document_id_1", "");
  }
}
