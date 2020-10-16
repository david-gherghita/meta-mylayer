rfkill unblock wifi
wpa_supplicant -c /etc/wpa_supplicant.conf -i wlan0 &
udhcpc -i wlan0

/etc/init.d/ntpd stop
ntpd -gq
/etc/init.d/ntpd start
