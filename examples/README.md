# signNow Java SDK Examples

## Setup

1. See the configuration template example for reference:

```bash
vim examples/signnow-example.properties.example
```

Start from an empty template:

```bash
cp examples/signnow-example.properties.empty examples/signnow-example.properties
```

2. Edit `examples/signnow-example.properties` with your signNow API credentials and actual resource IDs.
   
> `signnow-example.properties` is git-ignored and will not be committed.

## Running examples

Run a single example:

```bash
make example E=DocumentGetExample
```

Run all examples:

```bash
make examples
```

Or call the script directly:

```bash
examples/bin/run DocumentGetExample
examples/bin/run all
```

## Configuration

Properties follow the naming convention `{domainName}_{variableName}`:
Global properties are an exception and omit {domainName}.

| Property | Description |
|---|---|
| `bearer_token` | Your signNow API bearer token |
| `path_to_document` | Path to a PDF file for upload examples |
| `document_id` | Existing document ID |
| `bulk_invite_template_id` | Template ID for bulk invite |
| ... | See `signnow-example.properties.example` for the full list |
