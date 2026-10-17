import re

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'r') as f:
    content = f.read()

old_grid = """        val gridApps = listOf(
            AppConfig("chat", "SeeChat", Icons.Default.ChatBubble, Color(0xFF00A884), unreadChatCount),
            AppConfig("cast", "Cast", Icons.Default.AlternateEmail, Color(0xFFE91E63), if (state.trendingScore > 40f) 1 else 0),
            AppConfig("metube", "MeTube", Icons.Default.PlayArrow, Color(0xFFFF0033), 0),
            AppConfig("songify", "Songify", Icons.Default.GraphicEq, Color(0xFF1DB954), 0),
            AppConfig("megaphone", "Megaphone", Icons.Default.MusicNote, Color(0xFFFC3C44), 0),
            AppConfig("jams", "Jams", Icons.Default.Headphones, Color(0xFF00E5FF), 0),
            AppConfig("sharp", "Sharp", Icons.Default.CloudUpload, Color(0xFFFF5500), 0),
            AppConfig("tunes", "Tunes", Icons.Default.Album, Color(0xFFFFAA00), 0),
            AppConfig("weshare", "WESHARE", Icons.Default.TrendingUp, Color(0xFF00C853), state.pendingStockOrders.size),
            AppConfig("genesis", "Genesis", Icons.Default.AccountBalanceWallet, Color(0xFFFF9100), state.pendingCryptoOrders.size),
            AppConfig("bank", "Apex Bank", Icons.Default.AccountBalance, Color(0xFF7C4DFF), bankAlertCount),
            AppConfig("recruit", "Staff Hub", Icons.Default.Badge, Color(0xFF00E5FF), 0),
            AppConfig("spiritual", "Soul Care", Icons.Default.Spa, Color(0xFFFFD600), wellnessAlertCount),
            AppConfig("calendar", "Planner", Icons.Default.CalendarMonth, Color(0xFFFF4081), 0),
            AppConfig("email", "Mail", Icons.Default.Mail, Color(0xFF2979FF), unreadMailCount),
            AppConfig("capital_club", "Crush", Icons.Default.Favorite, Color(0xFFE91E63), 0),
            AppConfig("promo", "Ad Company", Icons.Default.Campaign, Color(0xFF69F0AE), 0),
            AppConfig("merch", "Merch", Icons.Default.Storefront, Color(0xFFFF6E40), 0),
            AppConfig("security_app", "Shield", Icons.Default.Shield, Color(0xFF40C4FF), 0),
            AppConfig("notes", "Notes", Icons.Default.Description, Color(0xFFFFAB00), 0),
            AppConfig("camera", "Camera", Icons.Default.PhotoCamera, Color(0xFF64DD17), 0),
            AppConfig("browser", "Web Hub", Icons.Default.Public, Color(0xFF536DFE), 0),
            AppConfig("legacy", "Legacy", Icons.Default.EmojiEvents, Color(0xFFFFD700), 0),
            AppConfig("os_upgrade", "OS Upgrade", Icons.Default.SystemUpdate, Color(0xFF6200EA), 0),
            AppConfig("settings", "Settings", Icons.Default.Settings, Color(0xFF9E9E9E), 0)
        )"""

new_grid = """        val gridApps = when (state.activePhone) {
            "hiPhone" -> listOf(
                AppConfig("chat", "SeeChat", Icons.Default.Forum, Color(0xFF34C759), unreadChatCount),
                AppConfig("cast", "Cast", Icons.Default.Tag, Color(0xFFFF2D55), if (state.trendingScore > 40f) 1 else 0),
                AppConfig("metube", "MeTube", Icons.Default.OndemandVideo, Color(0xFFFF3B30), 0),
                AppConfig("songify", "Songify", Icons.Default.LibraryMusic, Color(0xFF1DB954), 0),
                AppConfig("megaphone", "Megaphone", Icons.Default.QueueMusic, Color(0xFFFC3C44), 0),
                AppConfig("jams", "Jams", Icons.Default.Headset, Color(0xFF32ADE6), 0),
                AppConfig("sharp", "Sharp", Icons.Default.Backup, Color(0xFFFF9500), 0),
                AppConfig("tunes", "Tunes", Icons.Default.Audiotrack, Color(0xFFFFCC00), 0),
                AppConfig("weshare", "WESHARE", Icons.Default.SsidChart, Color(0xFF34C759), state.pendingStockOrders.size),
                AppConfig("genesis", "Genesis", Icons.Default.CurrencyBitcoin, Color(0xFFFF9500), state.pendingCryptoOrders.size),
                AppConfig("bank", "Apex Bank", Icons.Default.Museum, Color(0xFF5856D6), bankAlertCount),
                AppConfig("recruit", "Staff Hub", Icons.Default.AssignmentInd, Color(0xFF32ADE6), 0),
                AppConfig("spiritual", "Soul Care", Icons.Default.SelfImprovement, Color(0xFFFFCC00), wellnessAlertCount),
                AppConfig("calendar", "Planner", Icons.Default.Event, Color(0xFFFF2D55), 0),
                AppConfig("email", "Mail", Icons.Default.MarkEmailUnread, Color(0xFF007AFF), unreadMailCount),
                AppConfig("capital_club", "Crush", Icons.Default.FavoriteBorder, Color(0xFFFF2D55), 0),
                AppConfig("promo", "Ad Company", Icons.Default.RecordVoiceOver, Color(0xFF34C759), 0),
                AppConfig("merch", "Merch", Icons.Default.ShoppingBag, Color(0xFFFF9500), 0),
                AppConfig("security_app", "Shield", Icons.Default.Security, Color(0xFF32ADE6), 0),
                AppConfig("notes", "Notes", Icons.Default.Note, Color(0xFFFFCC00), 0),
                AppConfig("camera", "Camera", Icons.Default.CameraAlt, Color(0xFF34C759), 0),
                AppConfig("browser", "Web Hub", Icons.Default.TravelExplore, Color(0xFF007AFF), 0),
                AppConfig("legacy", "Legacy", Icons.Default.WorkspacePremium, Color(0xFFFFCC00), 0),
                AppConfig("os_upgrade", "OS Upgrade", Icons.Default.BrowserUpdated, Color(0xFF5856D6), 0),
                AppConfig("settings", "Settings", Icons.Default.ManageAccounts, Color(0xFF8E8E93), 0)
            )
            "Xiaomax", "TECCNO" -> listOf(
                AppConfig("chat", "SeeChat", Icons.Default.Chat, Color(0xFF00C853), unreadChatCount),
                AppConfig("cast", "Cast", Icons.Default.FlutterDash, Color(0xFFFF3D00), if (state.trendingScore > 40f) 1 else 0),
                AppConfig("metube", "MeTube", Icons.Default.SlowMotionVideo, Color(0xFFD50000), 0),
                AppConfig("songify", "Songify", Icons.Default.Equalizer, Color(0xFF00E676), 0),
                AppConfig("megaphone", "Megaphone", Icons.Default.SpeakerGroup, Color(0xFFFF1744), 0),
                AppConfig("jams", "Jams", Icons.Default.SurroundSound, Color(0xFF00B0FF), 0),
                AppConfig("sharp", "Sharp", Icons.Default.SettingsSystemDaydream, Color(0xFFFF6D00), 0),
                AppConfig("tunes", "Tunes", Icons.Default.Radio, Color(0xFFFFD600), 0),
                AppConfig("weshare", "WESHARE", Icons.Default.ShowChart, Color(0xFF00E676), state.pendingStockOrders.size),
                AppConfig("genesis", "Genesis", Icons.Default.MonetizationOn, Color(0xFFFF6D00), state.pendingCryptoOrders.size),
                AppConfig("bank", "Apex Bank", Icons.Default.AccountBalance, Color(0xFF6200EA), bankAlertCount),
                AppConfig("recruit", "Staff Hub", Icons.Default.SupervisedUserCircle, Color(0xFF00B0FF), 0),
                AppConfig("spiritual", "Soul Care", Icons.Default.AcUnit, Color(0xFFFFEA00), wellnessAlertCount),
                AppConfig("calendar", "Planner", Icons.Default.EditCalendar, Color(0xFFF50057), 0),
                AppConfig("email", "Mail", Icons.Default.Email, Color(0xFF2962FF), unreadMailCount),
                AppConfig("capital_club", "Crush", Icons.Default.Loyalty, Color(0xFFF50057), 0),
                AppConfig("promo", "Ad Company", Icons.Default.Podcasts, Color(0xFF00E676), 0),
                AppConfig("merch", "Merch", Icons.Default.LocalMall, Color(0xFFFF6D00), 0),
                AppConfig("security_app", "Shield", Icons.Default.GppGood, Color(0xFF00B0FF), 0),
                AppConfig("notes", "Notes", Icons.Default.SpeakerNotes, Color(0xFFFFEA00), 0),
                AppConfig("camera", "Camera", Icons.Default.Camera, Color(0xFF00E676), 0),
                AppConfig("browser", "Web Hub", Icons.Default.Explore, Color(0xFF2962FF), 0),
                AppConfig("legacy", "Legacy", Icons.Default.Stars, Color(0xFFFFEA00), 0),
                AppConfig("os_upgrade", "OS Upgrade", Icons.Default.SystemUpdateAlt, Color(0xFF6200EA), 0),
                AppConfig("settings", "Settings", Icons.Default.DisplaySettings, Color(0xFF757575), 0)
            )
            else -> listOf(
                AppConfig("chat", "SeeChat", Icons.Default.ChatBubble, Color(0xFF00A884), unreadChatCount),
                AppConfig("cast", "Cast", Icons.Default.AlternateEmail, Color(0xFFE91E63), if (state.trendingScore > 40f) 1 else 0),
                AppConfig("metube", "MeTube", Icons.Default.PlayArrow, Color(0xFFFF0033), 0),
                AppConfig("songify", "Songify", Icons.Default.GraphicEq, Color(0xFF1DB954), 0),
                AppConfig("megaphone", "Megaphone", Icons.Default.MusicNote, Color(0xFFFC3C44), 0),
                AppConfig("jams", "Jams", Icons.Default.Headphones, Color(0xFF00E5FF), 0),
                AppConfig("sharp", "Sharp", Icons.Default.CloudUpload, Color(0xFFFF5500), 0),
                AppConfig("tunes", "Tunes", Icons.Default.Album, Color(0xFFFFAA00), 0),
                AppConfig("weshare", "WESHARE", Icons.Default.TrendingUp, Color(0xFF00C853), state.pendingStockOrders.size),
                AppConfig("genesis", "Genesis", Icons.Default.AccountBalanceWallet, Color(0xFFFF9100), state.pendingCryptoOrders.size),
                AppConfig("bank", "Apex Bank", Icons.Default.AccountBalance, Color(0xFF7C4DFF), bankAlertCount),
                AppConfig("recruit", "Staff Hub", Icons.Default.Badge, Color(0xFF00E5FF), 0),
                AppConfig("spiritual", "Soul Care", Icons.Default.Spa, Color(0xFFFFD600), wellnessAlertCount),
                AppConfig("calendar", "Planner", Icons.Default.CalendarMonth, Color(0xFFFF4081), 0),
                AppConfig("email", "Mail", Icons.Default.Mail, Color(0xFF2979FF), unreadMailCount),
                AppConfig("capital_club", "Crush", Icons.Default.Favorite, Color(0xFFE91E63), 0),
                AppConfig("promo", "Ad Company", Icons.Default.Campaign, Color(0xFF69F0AE), 0),
                AppConfig("merch", "Merch", Icons.Default.Storefront, Color(0xFFFF6E40), 0),
                AppConfig("security_app", "Shield", Icons.Default.Shield, Color(0xFF40C4FF), 0),
                AppConfig("notes", "Notes", Icons.Default.Description, Color(0xFFFFAB00), 0),
                AppConfig("camera", "Camera", Icons.Default.PhotoCamera, Color(0xFF64DD17), 0),
                AppConfig("browser", "Web Hub", Icons.Default.Public, Color(0xFF536DFE), 0),
                AppConfig("legacy", "Legacy", Icons.Default.EmojiEvents, Color(0xFFFFD700), 0),
                AppConfig("os_upgrade", "OS Upgrade", Icons.Default.SystemUpdate, Color(0xFF6200EA), 0),
                AppConfig("settings", "Settings", Icons.Default.Settings, Color(0xFF9E9E9E), 0)
            )
        }"""

content = content.replace(old_grid, new_grid)

with open('app/src/main/java/com/example/SmartphoneComponent.kt', 'w') as f:
    f.write(content)
