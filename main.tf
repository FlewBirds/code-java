provider "azurerm"{
features {}
}

resource "azurerm_kubernetes_aks" "az-aks" {

name
location
rgname

dns_prefix =

linux_profile{

admin_username=

ssh_key{
keydata
}
}

agent pool profile{
name = "aks-agnets"
count = 3
os_type= "Linux"
os_disk

vnet_subnetid = ""
}

service principal{
client ID
client secret

}
tag = environment

}

resource "kubernetes_namespace" "projecta" {
metadata
{
name = proejcta
}

}
