## Generate private key
```openssl genpkey -algorithm RSA -out private_key.pem```

## Generate public key
```openssl rsa -pubout -in private_key.pem -out public_key.pem```
