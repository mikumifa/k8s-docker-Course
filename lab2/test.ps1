$intervalInSeconds = 1
$outputFile = "result.txt"

while ($true) {
    $url = "http://localhost:30956/user?id=2"

    $response = Invoke-WebRequest -Uri $url
    $responseContent = $response.Content

    Add-Content -Path $outputFile -Value $responseContent

    Write-Host "请求已发送并结果已追加到 $outputFile 文件中。"

    Start-Sleep -Seconds $intervalInSeconds
}
